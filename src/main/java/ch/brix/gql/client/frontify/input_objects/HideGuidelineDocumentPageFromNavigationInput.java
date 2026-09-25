package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for hiding a guideline document page from the navigation.
 */
public class HideGuidelineDocumentPageFromNavigationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page to hide from the navigation.
   */
  public HideGuidelineDocumentPageFromNavigationInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
