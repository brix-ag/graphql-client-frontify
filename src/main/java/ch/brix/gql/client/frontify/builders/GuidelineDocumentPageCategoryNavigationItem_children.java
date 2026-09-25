package ch.brix.gql.client.frontify.builders;

public class GuidelineDocumentPageCategoryNavigationItem_children extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelineDocumentPageCategoryChildrenItems> {
  public GuidelineDocumentPageCategoryNavigationItem_children() {
    super(new ch.brix.gql.client.Call<>("children", "GuidelineDocumentPageCategoryChildrenItems"));
  }
  public GuidelineDocumentPageCategoryNavigationItem_children args(GuidelineDocumentPageCategoryNavigationItem_children_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public GuidelineDocumentPageCategoryNavigationItem_children onGuidelineDocumentPageCategoryChildrenItems(On_GuidelineDocumentPageCategoryChildrenItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
