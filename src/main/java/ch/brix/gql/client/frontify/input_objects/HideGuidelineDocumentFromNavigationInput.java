package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for hiding a guideline document from the navigation.
 */
public class HideGuidelineDocumentFromNavigationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document to hide from the navigation.
   */
  public HideGuidelineDocumentFromNavigationInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
