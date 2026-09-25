package ch.brix.gql.client.frontify.builders;

public class On_ShowGuidelineDocumentLibraryInNavigation extends ch.brix.gql.client.TypeBuilder {
  public On_ShowGuidelineDocumentLibraryInNavigation() {
    super(new ch.brix.gql.client.On("ShowGuidelineDocumentLibraryInNavigation"));
  }
  /**
   * **BETA** The ID of the guideline document library shown in the navigation.
   */
  public On_ShowGuidelineDocumentLibraryInNavigation id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document library is hidden in navigation.
   */
  public On_ShowGuidelineDocumentLibraryInNavigation isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
