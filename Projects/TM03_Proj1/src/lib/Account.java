package lib;

abstract class Account {
  double interestRate;
  double amount;
  abstract double calculateInterest();
}
