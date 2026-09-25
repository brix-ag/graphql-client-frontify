package ch.brix.gql.client.frontify.builders;

public class GuidelineDocumentPageCategoryChildrenItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.unions.GuidelineDocumentPageCategoryChildNavigationItem>> {
  public GuidelineDocumentPageCategoryChildrenItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "GuidelineDocumentPageCategoryChildNavigationItem"));
  }
  public GuidelineDocumentPageCategoryChildrenItems_items onGuidelineDocumentPageLinkNavigationItem(On_GuidelineDocumentPageLinkNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineDocumentPageCategoryChildrenItems_items onGuidelineDocumentPageNavigationItem(On_GuidelineDocumentPageNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
