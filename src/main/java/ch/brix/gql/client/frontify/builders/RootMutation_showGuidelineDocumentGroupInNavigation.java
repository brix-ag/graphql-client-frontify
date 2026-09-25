package ch.brix.gql.client.frontify.builders;

public class RootMutation_showGuidelineDocumentGroupInNavigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ShowGuidelineDocumentGroupInNavigation> {
  public RootMutation_showGuidelineDocumentGroupInNavigation() {
    super(new ch.brix.gql.client.Call<>("showGuidelineDocumentGroupInNavigation", "ShowGuidelineDocumentGroupInNavigation"));
  }
  public RootMutation_showGuidelineDocumentGroupInNavigation args(RootMutation_showGuidelineDocumentGroupInNavigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_showGuidelineDocumentGroupInNavigation onShowGuidelineDocumentGroupInNavigation(On_ShowGuidelineDocumentGroupInNavigation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
