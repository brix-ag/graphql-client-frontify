package ch.brix.gql.client.frontify.builders;

import ch.brix.gql.client.frontify.unions.UnionGuidelineShizzleNavigationItem;

public class GuidelineNavigationItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<UnionGuidelineShizzleNavigationItem>> {
  public GuidelineNavigationItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "UnionGuidelineCoverPageNavigationItemGuidelineDocumentGroupNavigationItemGuidelineDocumentLibraryNavigationItemGuidelineDocumentLinkNavigationItemGuidelineDocumentNavigationItem"));
  }
  public GuidelineNavigationItems_items onGuidelineCoverPageNavigationItem(On_GuidelineCoverPageNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineNavigationItems_items onGuidelineDocumentGroupNavigationItem(On_GuidelineDocumentGroupNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineNavigationItems_items onGuidelineDocumentLibraryNavigationItem(On_GuidelineDocumentLibraryNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineNavigationItems_items onGuidelineDocumentLinkNavigationItem(On_GuidelineDocumentLinkNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public GuidelineNavigationItems_items onGuidelineDocumentNavigationItem(On_GuidelineDocumentNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
