package ch.brix.gql.client.frontify.builders;

public class RootMutation_showGuidelineDocumentPageInNavigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ShowGuidelineDocumentPageInNavigation> {
  public RootMutation_showGuidelineDocumentPageInNavigation() {
    super(new ch.brix.gql.client.Call<>("showGuidelineDocumentPageInNavigation", "ShowGuidelineDocumentPageInNavigation"));
  }
  public RootMutation_showGuidelineDocumentPageInNavigation args(RootMutation_showGuidelineDocumentPageInNavigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_showGuidelineDocumentPageInNavigation onShowGuidelineDocumentPageInNavigation(On_ShowGuidelineDocumentPageInNavigation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
