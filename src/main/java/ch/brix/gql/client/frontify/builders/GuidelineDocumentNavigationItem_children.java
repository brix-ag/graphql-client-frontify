package ch.brix.gql.client.frontify.builders;

public class GuidelineDocumentNavigationItem_children extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelineDocumentChildrenItems> {
  public GuidelineDocumentNavigationItem_children() {
    super(new ch.brix.gql.client.Call<>("children", "GuidelineDocumentChildrenItems"));
  }
  public GuidelineDocumentNavigationItem_children args(GuidelineDocumentNavigationItem_children_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public GuidelineDocumentNavigationItem_children onGuidelineDocumentChildrenItems(On_GuidelineDocumentChildrenItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
