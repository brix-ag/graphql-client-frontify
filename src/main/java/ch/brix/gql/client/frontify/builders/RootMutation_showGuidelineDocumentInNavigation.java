package ch.brix.gql.client.frontify.builders;

public class RootMutation_showGuidelineDocumentInNavigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ShowGuidelineDocumentInNavigation> {
  public RootMutation_showGuidelineDocumentInNavigation() {
    super(new ch.brix.gql.client.Call<>("showGuidelineDocumentInNavigation", "ShowGuidelineDocumentInNavigation"));
  }
  public RootMutation_showGuidelineDocumentInNavigation args(RootMutation_showGuidelineDocumentInNavigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_showGuidelineDocumentInNavigation onShowGuidelineDocumentInNavigation(On_ShowGuidelineDocumentInNavigation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
