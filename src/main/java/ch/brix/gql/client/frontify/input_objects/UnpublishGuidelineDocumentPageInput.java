package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for unpublishing a guideline document page.
 */
public class UnpublishGuidelineDocumentPageInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page to unpublish.
   */
  public UnpublishGuidelineDocumentPageInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
