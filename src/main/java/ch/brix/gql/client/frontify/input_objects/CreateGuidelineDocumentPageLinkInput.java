package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for creating a guideline document page link.
 */
public class CreateGuidelineDocumentPageLinkInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the entity to create the link in (GuidelineDocument or GuidelineDocumentPageCategory).
   */
  public CreateGuidelineDocumentPageLinkInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * **BETA** The title of the link.
   */
  public CreateGuidelineDocumentPageLinkInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** The link URL.
   */
  public CreateGuidelineDocumentPageLinkInput url(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("url", v);
    return this;
  }
}
