package ch.brix.gql.client.frontify.builders;

public class On_HideGuidelineDocumentLibraryFromNavigation extends ch.brix.gql.client.TypeBuilder {
  public On_HideGuidelineDocumentLibraryFromNavigation() {
    super(new ch.brix.gql.client.On("HideGuidelineDocumentLibraryFromNavigation"));
  }
  /**
   * **BETA** The ID of the guideline document library hidden from the navigation.
   */
  public On_HideGuidelineDocumentLibraryFromNavigation id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document library is hidden in navigation.
   */
  public On_HideGuidelineDocumentLibraryFromNavigation isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
