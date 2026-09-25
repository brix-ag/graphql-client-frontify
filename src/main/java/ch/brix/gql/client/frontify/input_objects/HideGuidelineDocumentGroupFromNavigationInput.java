package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for hiding a guideline document group from the navigation.
 */
public class HideGuidelineDocumentGroupFromNavigationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document group to hide from the navigation.
   */
  public HideGuidelineDocumentGroupFromNavigationInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
