package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for creating a guideline document page.
 */
public class CreateGuidelineDocumentPageInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the parent where guideline document page should be created in. Can be either a GuidelineDocument or GuidelineDocumentPageCategory
   */
  public CreateGuidelineDocumentPageInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * **BETA** The title of the guideline document page id.
   */
  public CreateGuidelineDocumentPageInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
}
