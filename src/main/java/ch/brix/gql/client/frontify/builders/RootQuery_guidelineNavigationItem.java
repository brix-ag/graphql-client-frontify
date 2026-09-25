package ch.brix.gql.client.frontify.builders;

public class RootQuery_guidelineNavigationItem extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.GuidelineNavigationItem> {
  public RootQuery_guidelineNavigationItem() {
    super(new ch.brix.gql.client.Call<>("guidelineNavigationItem", "GuidelineNavigationItem"));
  }
  public RootQuery_guidelineNavigationItem args(RootQuery_guidelineNavigationItem_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_guidelineNavigationItem onGuidelineCoverPageNavigationItem(On_GuidelineCoverPageNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelineNavigationItem onGuidelineDocumentGroupNavigationItem(On_GuidelineDocumentGroupNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelineNavigationItem onGuidelineDocumentLibraryNavigationItem(On_GuidelineDocumentLibraryNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelineNavigationItem onGuidelineDocumentLinkNavigationItem(On_GuidelineDocumentLinkNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelineNavigationItem onGuidelineDocumentNavigationItem(On_GuidelineDocumentNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelineNavigationItem onGuidelineDocumentPageCategoryNavigationItem(On_GuidelineDocumentPageCategoryNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelineNavigationItem onGuidelineDocumentPageLinkNavigationItem(On_GuidelineDocumentPageLinkNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelineNavigationItem onGuidelineDocumentPageNavigationItem(On_GuidelineDocumentPageNavigationItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
