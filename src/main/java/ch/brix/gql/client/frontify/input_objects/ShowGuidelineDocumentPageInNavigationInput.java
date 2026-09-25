package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for showing a guideline document page in the navigation.
 */
public class ShowGuidelineDocumentPageInNavigationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page to show in the navigation.
   */
  public ShowGuidelineDocumentPageInNavigationInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
