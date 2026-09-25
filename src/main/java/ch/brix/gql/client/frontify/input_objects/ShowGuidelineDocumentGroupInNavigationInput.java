package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for showing a guideline document group in the navigation.
 */
public class ShowGuidelineDocumentGroupInNavigationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document group to show in the navigation.
   */
  public ShowGuidelineDocumentGroupInNavigationInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
