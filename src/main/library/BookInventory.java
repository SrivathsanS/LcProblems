package main.library;

public class BookInventory {

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getSoft_reserve_qty() {
        return soft_reserve_qty;
    }

    public void setSoft_reserve_qty(Integer soft_reserve_qty) {
        this.soft_reserve_qty = soft_reserve_qty;
    }

    public Integer getHard_reserve_qty() {
        return hard_reserve_qty;
    }

    public void setHard_reserve_qty(Integer hard_reserve_qty) {
        this.hard_reserve_qty = hard_reserve_qty;
    }

    public String bookId;
    public Integer qty;
    public Integer soft_reserve_qty;
    public Integer hard_reserve_qty;

}
