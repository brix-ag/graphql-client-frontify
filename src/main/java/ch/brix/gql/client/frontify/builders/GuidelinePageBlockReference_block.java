package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockReference_block extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.GuidelinePageBlockInterface> {
  public GuidelinePageBlockReference_block() {
    super(new ch.brix.gql.client.Call<>("block", "GuidelinePageBlockInterface"));
  }
  public GuidelinePageBlockReference_block onBrandEssentialsColorBlock(On_BrandEssentialsColorBlock typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelinePageBlockReference_block onGuidelinePageBlock(On_GuidelinePageBlock typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelinePageBlockReference_block onGuidelinePageBlockInterface(On_GuidelinePageBlockInterface typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
