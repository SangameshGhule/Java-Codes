import java.util.*;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");

            List<ServiceRateDetails> serviceRateDetailsList= new ArrayList<>(); {
                serviceRateDetailsList.add(new ServiceRateDetails("12.45", "","FEDEX"));
                serviceRateDetailsList.add(new ServiceRateDetails("12.45", "", "UPS"));
                serviceRateDetailsList.add(new ServiceRateDetails("15.44", "","STAMPS-USPS"));
            }

            Main main= new Main();
            main.processForLeastCost(serviceRateDetailsList,"UPS");
        }


        public void processForLeastCost(List<ServiceRateDetails> serviceRateDetailList, String primaryCarrierName) {

            List<ServiceRateDetails> leastCostServiceRateDetail = new ArrayList<>();
            List<ServiceRateDetails> leastNegoCostServiceRateDetail = new ArrayList<>();

            double minAmount = Double.parseDouble(serviceRateDetailList.stream().min(Comparator.comparing(s -> Double.valueOf(s.getAmount()))).get().getAmount());
            double minNegotiatedAmount=0.0;
            List<ServiceRateDetails> serviceRateDetailsList = serviceRateDetailList.stream().filter(s -> !Objects.equals(s.getNegAmount(), "")).toList();
            System.out.println(serviceRateDetailsList+"&&");
            if(!serviceRateDetailsList.isEmpty()){
                minNegotiatedAmount = Double.parseDouble(serviceRateDetailsList.stream().min(Comparator.comparing((s->Double.valueOf(s.getNegAmount())))).get().getNegAmount());
            }

            System.out.println(minAmount);
            System.out.println(minNegotiatedAmount);

            for (ServiceRateDetails s : serviceRateDetailList) {
                if (Double.parseDouble(s.getAmount()) == minAmount) {
                    leastCostServiceRateDetail.add(s);
                }
                if(!s.negAmount.isEmpty()) {
                    if (Double.parseDouble(s.getNegAmount()) == minNegotiatedAmount) {
                        leastNegoCostServiceRateDetail.add(s);
                    }
                }
            }

            System.out.println(leastCostServiceRateDetail);
            System.out.println(leastNegoCostServiceRateDetail);

            List<ServiceRateDetails> leastCostByCarrier = filterByPrimaryCarrier(leastCostServiceRateDetail, primaryCarrierName);
            List<ServiceRateDetails> leastNegoCostByCarrier = filterByPrimaryCarrier(leastNegoCostServiceRateDetail, primaryCarrierName);

            System.out.println(leastCostByCarrier);
            System.out.println(leastNegoCostByCarrier);

            List<ServiceRateDetails> finalLeastCost;
            if (!leastNegoCostByCarrier.isEmpty() && Double.parseDouble(leastNegoCostByCarrier.get(0).getNegAmount()) < Double.parseDouble(leastCostByCarrier.get(0).getAmount())) {
                finalLeastCost = leastNegoCostByCarrier;
            } else {
                finalLeastCost = leastCostByCarrier;
            }

            System.out.println(finalLeastCost);
        }

        private List<ServiceRateDetails> filterByPrimaryCarrier(List<ServiceRateDetails> serviceRateDetails , String primaryCarrierName) {
            if(serviceRateDetails.size() > 0) {
                List<ServiceRateDetails> filteredList = serviceRateDetails.stream().filter(s2 -> s2.getCarrierName().equalsIgnoreCase(primaryCarrierName)).collect(Collectors.toList());
                return filteredList.isEmpty() ? Collections.singletonList(serviceRateDetails.get(0)) : filteredList;
            }
            System.out.println(serviceRateDetails+"%");
            return serviceRateDetails;
        }

    }

    class ServiceRateDetails {
        String amount;
        String negAmount;
        String carrierName;

        public String getAmount() {
            return amount;
        }

        public String getNegAmount() {
            return negAmount;
        }

        public String getCarrierName() {
            return carrierName;
        }

        @Override
        public String toString() {
            return "ServiceRateDetails{" +
                    "amount='" + amount + '\'' +
                    ", negAmount='" + negAmount + '\'' +
                    ", carrierName='" + carrierName + '\'' +
                    '}';
        }

        public ServiceRateDetails(String amount, String negAmount, String carrierName) {
            this.amount = amount;
            this.negAmount = negAmount;
            this.carrierName = carrierName;
        }
    }
