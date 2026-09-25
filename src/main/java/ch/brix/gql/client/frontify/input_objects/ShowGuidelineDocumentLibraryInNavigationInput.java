package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for showing a guideline document library in the navigation.
 */
public class ShowGuidelineDocumentLibraryInNavigationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document library to show in the navigation.
   */
  public ShowGuidelineDocumentLibraryInNavigationInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
