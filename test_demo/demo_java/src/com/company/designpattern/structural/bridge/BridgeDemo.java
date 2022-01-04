package com.company.designpattern.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Bank vietcomBank = new VietcomBank(new CheckingAccount());
        vietcomBank.openAccount();

        Bank tpBank = new TPBank(new CheckingAccount());
        tpBank.openAccount();
    }

    public abstract static class Bank {

        protected Account account;

        public Bank(Account account) {
            this.account = account;
        }

        public abstract void openAccount();
    }

    public interface Account {
        void openAccount();
    }

    public static class CheckingAccount implements Account {

        @Override
        public void openAccount() {
            System.out.println("Checking Account");
        }
    }

    public class SavingAccount implements Account {

        @Override
        public void openAccount() {
            System.out.println("Saving Account");
        }
    }

    public static class VietcomBank extends Bank {

        public VietcomBank(Account account) {
            super(account);
        }

        @Override
        public void openAccount() {
            System.out.print("Open your account at VietcomBank is a ");
            account.openAccount();
        }
    }

    public static class TPBank extends Bank {

        public TPBank(Account account) {
            super(account);
        }

        @Override
        public void openAccount() {
            System.out.print("Open your account at TPBank is a ");
            account.openAccount();
        }
    }
}
