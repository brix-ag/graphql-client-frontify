package ch.brix.gql.client.frontify.builders;

public class RootMutation_showGuidelineDocumentLibraryInNavigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ShowGuidelineDocumentLibraryInNavigation> {
  public RootMutation_showGuidelineDocumentLibraryInNavigation() {
    super(new ch.brix.gql.client.Call<>("showGuidelineDocumentLibraryInNavigation", "ShowGuidelineDocumentLibraryInNavigation"));
  }
  public RootMutation_showGuidelineDocumentLibraryInNavigation args(RootMutation_showGuidelineDocumentLibraryInNavigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_showGuidelineDocumentLibraryInNavigation onShowGuidelineDocumentLibraryInNavigation(On_ShowGuidelineDocumentLibraryInNavigation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
