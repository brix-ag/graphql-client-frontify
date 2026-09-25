package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for updating a guideline document page link. Omitted fields are left unchanged.
 */
public class UpdateGuidelineDocumentPageLinkInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page link to update.
   */
  public UpdateGuidelineDocumentPageLinkInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** Language code the title is written in. Only meaningful together with `title`. Omit it (or pass the default language) to update the base title; pass a non-default language to update that translation.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public UpdateGuidelineDocumentPageLinkInput language(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("language", v);
    return this;
  }
  /**
   * **BETA** The new title of the link.
   */
  public UpdateGuidelineDocumentPageLinkInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** The link URL.
   */
  public UpdateGuidelineDocumentPageLinkInput url(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("url", v);
    return this;
  }
}
