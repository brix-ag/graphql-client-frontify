package ch.brix.gql.client.frontify.builders;

public class RootMutation_hideGuidelineDocumentGroupFromNavigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.HideGuidelineDocumentGroupFromNavigation> {
  public RootMutation_hideGuidelineDocumentGroupFromNavigation() {
    super(new ch.brix.gql.client.Call<>("hideGuidelineDocumentGroupFromNavigation", "HideGuidelineDocumentGroupFromNavigation"));
  }
  public RootMutation_hideGuidelineDocumentGroupFromNavigation args(RootMutation_hideGuidelineDocumentGroupFromNavigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_hideGuidelineDocumentGroupFromNavigation onHideGuidelineDocumentGroupFromNavigation(On_HideGuidelineDocumentGroupFromNavigation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
