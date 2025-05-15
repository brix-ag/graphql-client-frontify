package ch.brix.gql.client.frontify.builders;

public class GuidelinePageSectionElementItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.unions.GuidelinePageSectionElement>> {
  public GuidelinePageSectionElementItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "GuidelinePageSectionElement"));
  }
  public GuidelinePageSectionElementItems_items onGuidelinePageHeading(On_GuidelinePageHeading typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelinePageSectionElementItems_items onGuidelinePageBlock(On_GuidelinePageBlock typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelinePageSectionElementItems_items onGuidelinePageBlockReference(On_GuidelinePageBlockReference typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
