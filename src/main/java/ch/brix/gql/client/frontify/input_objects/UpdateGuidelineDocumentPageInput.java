package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for updating a guideline document page. Omitted fields are left unchanged.
 */
public class UpdateGuidelineDocumentPageInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page to update.
   */
  public UpdateGuidelineDocumentPageInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** Language code the title is written in. Only meaningful together with `title`. Omit it (or pass the default language) to update the base title; pass a non-default language to update that translation.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public UpdateGuidelineDocumentPageInput language(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("language", v);
    return this;
  }
  /**
   * **BETA** The new title of the document page.
   */
  public UpdateGuidelineDocumentPageInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** The new heading of the document page.
   */
  public UpdateGuidelineDocumentPageInput heading(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("heading", v);
    return this;
  }
  /**
   * **BETA** The new subheading of the document page.
   */
  public UpdateGuidelineDocumentPageInput subheading(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("subheading", v);
    return this;
  }
}
