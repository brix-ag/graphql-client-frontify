package ch.brix.gql.client.frontify.builders;

public class RootMutation_hideGuidelineDocumentFromNavigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.HideGuidelineDocumentFromNavigation> {
  public RootMutation_hideGuidelineDocumentFromNavigation() {
    super(new ch.brix.gql.client.Call<>("hideGuidelineDocumentFromNavigation", "HideGuidelineDocumentFromNavigation"));
  }
  public RootMutation_hideGuidelineDocumentFromNavigation args(RootMutation_hideGuidelineDocumentFromNavigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_hideGuidelineDocumentFromNavigation onHideGuidelineDocumentFromNavigation(On_HideGuidelineDocumentFromNavigation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
