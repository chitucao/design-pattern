package cn.chitucao.designpattern.b1_strategy.promotion;

/**
 * 优惠活动
 * Created by Tom
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }

}
