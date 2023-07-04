class Customer {
    public final CustomerId id;
    public final PurchasePoint possessionPoint;
    public Customer() {
        id = new CustomerId();
        possessionPoint = new PurchasePoint();
    }
    public boolean isEnabled() {
    return true;
    }
    public boolean isDisabled(){
        return false;
    }

    /**
     * @param comic 購入者のWebコミック
     * @return 所持ポイントが不足している場合True
     */
    publiv boolean isShortOfPoint(Comic comic){
        return possessionPoint.amount < comic.currentPurchasePoint.amount;
    }
}

