package ch.brix.gql.client.frontify.builders;

public class RootMutation_hideGuidelineDocumentLibraryFromNavigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.HideGuidelineDocumentLibraryFromNavigation> {
  public RootMutation_hideGuidelineDocumentLibraryFromNavigation() {
    super(new ch.brix.gql.client.Call<>("hideGuidelineDocumentLibraryFromNavigation", "HideGuidelineDocumentLibraryFromNavigation"));
  }
  public RootMutation_hideGuidelineDocumentLibraryFromNavigation args(RootMutation_hideGuidelineDocumentLibraryFromNavigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_hideGuidelineDocumentLibraryFromNavigation onHideGuidelineDocumentLibraryFromNavigation(On_HideGuidelineDocumentLibraryFromNavigation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
