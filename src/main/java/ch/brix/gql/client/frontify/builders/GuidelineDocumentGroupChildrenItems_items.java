package ch.brix.gql.client.frontify.builders;

public class GuidelineDocumentGroupChildrenItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.unions.UnionGuidelineDocumentLibraryNavigationItemGuidelineDocumentLinkNavigationItemGuidelineDocumentNavigationItem>> {
  public GuidelineDocumentGroupChildrenItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "UnionGuidelineDocumentLibraryNavigationItemGuidelineDocumentLinkNavigationItemGuidelineDocumentNavigationItem"));
  }
  public GuidelineDocumentGroupChildrenItems_items onGuidelineDocumentLibraryNavigationItem(On_GuidelineDocumentLibraryNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineDocumentGroupChildrenItems_items onGuidelineDocumentLinkNavigationItem(On_GuidelineDocumentLinkNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineDocumentGroupChildrenItems_items onGuidelineDocumentNavigationItem(On_GuidelineDocumentNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
