package ch.brix.gql.client.frontify.builders;

public class RootMutation_hideGuidelineDocumentPageFromNavigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.HideGuidelineDocumentPageFromNavigation> {
  public RootMutation_hideGuidelineDocumentPageFromNavigation() {
    super(new ch.brix.gql.client.Call<>("hideGuidelineDocumentPageFromNavigation", "HideGuidelineDocumentPageFromNavigation"));
  }
  public RootMutation_hideGuidelineDocumentPageFromNavigation args(RootMutation_hideGuidelineDocumentPageFromNavigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_hideGuidelineDocumentPageFromNavigation onHideGuidelineDocumentPageFromNavigation(On_HideGuidelineDocumentPageFromNavigation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
