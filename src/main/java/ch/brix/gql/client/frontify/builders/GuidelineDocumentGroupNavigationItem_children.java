package ch.brix.gql.client.frontify.builders;

public class GuidelineDocumentGroupNavigationItem_children extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelineDocumentGroupChildrenItems> {
  public GuidelineDocumentGroupNavigationItem_children() {
    super(new ch.brix.gql.client.Call<>("children", "GuidelineDocumentGroupChildrenItems"));
  }
  public GuidelineDocumentGroupNavigationItem_children args(GuidelineDocumentGroupNavigationItem_children_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public GuidelineDocumentGroupNavigationItem_children onGuidelineDocumentGroupChildrenItems(On_GuidelineDocumentGroupChildrenItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
