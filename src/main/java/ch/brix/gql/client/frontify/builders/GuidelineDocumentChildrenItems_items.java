package ch.brix.gql.client.frontify.builders;

public class GuidelineDocumentChildrenItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.unions.GuidelineDocumentChildNavigationItem>> {
  public GuidelineDocumentChildrenItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "GuidelineDocumentChildNavigationItem"));
  }
  public GuidelineDocumentChildrenItems_items onGuidelineDocumentPageCategoryNavigationItem(On_GuidelineDocumentPageCategoryNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineDocumentChildrenItems_items onGuidelineDocumentPageLinkNavigationItem(On_GuidelineDocumentPageLinkNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineDocumentChildrenItems_items onGuidelineDocumentPageNavigationItem(On_GuidelineDocumentPageNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
