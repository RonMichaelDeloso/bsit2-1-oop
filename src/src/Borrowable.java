interface Borrowable{
        void borrowItem(String borrowName);
        void returnItem();
        boolean isAvailable();
        int getBorrowingPeriod();
        default String getBorrowingStatus(){return isAvailable() ?"Available for borrowing" : "Currently borrowed";}
    }

