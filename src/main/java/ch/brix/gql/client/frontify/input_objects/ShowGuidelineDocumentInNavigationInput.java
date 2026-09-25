package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for showing a guideline document in the navigation.
 */
public class ShowGuidelineDocumentInNavigationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document to show in the navigation.
   */
  public ShowGuidelineDocumentInNavigationInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
