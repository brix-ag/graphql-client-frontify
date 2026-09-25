package ch.brix.gql.client.frontify.builders;

public class GuidelineContentSearchResult_content extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.GuidelineContentSearchResultContent> {
  public GuidelineContentSearchResult_content() {
    super(new ch.brix.gql.client.Call<>("content", "GuidelineContentSearchResultContent"));
  }
  public GuidelineContentSearchResult_content onGuidelinePage(On_GuidelinePage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineContentSearchResult_content onGuidelinePageBlock(On_GuidelinePageBlock typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineContentSearchResult_content onGuidelinePageHeading(On_GuidelinePageHeading typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
