// public class Payroll {
//   private int[] itemsSold; // number of items sold by each employee
//   private double[] wages; // wages to be computed in part (b)

//   public Payroll(int[] items) {
//     itemsSold = items;
//     wages = new double[items.length];
//   }

//   /*
//    * Returns the bonus threshold as described in part (a).
//    */
//   public double computeBonusThreshold() {
//     int min = Integer.MAX_VALUE;
//     int max = 0;
//     for (int m = 0; m < itemsSold.length; m++) {
//       if (itemsSold[m] < min) {
//         min = itemsSold[m];
//       }
//     }
//     for (int n = 0; n < itemsSold.length; n++) {
//       if (itemsSold[n] > max) {
//         max = itemsSold[n];
//       }
//     }
//     int out = 0;
//     for (int i : itemsSold) {
//       out += i;
//     }
//     return (double) (out - min - max) / (itemsSold.length - 2);
//   }

//   /*
//    * Computes employee wages as described in part (b) and stores
//    * them in wages. The parameter fixedWage represents the fixed
//    * amount each employee is paid per day. The parameter
//    * perItemWage represents the amount each employee is paid per
//    * item sold.
//    */
//   public void computeWages(double fixedWage, double perItemWage) {
//     double bonus = computeBonusThreshold();
//     wages= new double[itemsSold.length];

//     for (int i = 0; i < itemsSold.length; i++) {
//       if ((itemsSold[i]) > bonus) {
//         wages[i] = (itemsSold[i] * perItemWage + fixedWage) * 1.1;
//       } else {
//         wages[i] = itemsSold[i] * perItemWage + fixedWage;

//       }
//     }
//   }

//   public double[] getWages() {
//     return wages;
//   }

// }
