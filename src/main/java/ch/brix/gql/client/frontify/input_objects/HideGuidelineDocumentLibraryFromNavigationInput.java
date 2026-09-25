package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for hiding a guideline document library from the navigation.
 */
public class HideGuidelineDocumentLibraryFromNavigationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document library to hide from the navigation.
   */
  public HideGuidelineDocumentLibraryFromNavigationInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
