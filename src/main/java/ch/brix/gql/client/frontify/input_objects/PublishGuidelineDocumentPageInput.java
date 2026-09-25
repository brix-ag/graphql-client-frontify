package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for publishing a guideline document page.
 */
public class PublishGuidelineDocumentPageInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page to publish.
   */
  public PublishGuidelineDocumentPageInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
