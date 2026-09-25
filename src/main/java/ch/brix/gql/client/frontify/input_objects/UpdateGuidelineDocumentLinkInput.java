package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for updating a guideline document link. Omitted fields are left unchanged. Only `iconAssetId` and `iconFileId` accept `null`, which removes the icon.
 */
public class UpdateGuidelineDocumentLinkInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document link to update.
   */
  public UpdateGuidelineDocumentLinkInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** Language code the title is written in. Only meaningful together with `title`. Omit it (or pass the default language) to update the base title; pass a non-default language to update that translation.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public UpdateGuidelineDocumentLinkInput language(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("language", v);
    return this;
  }
  /**
   * **BETA** The new title of the link.
   */
  public UpdateGuidelineDocumentLinkInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** The link URL.
   */
  public UpdateGuidelineDocumentLinkInput url(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("url", v);
    return this;
  }
  /**
   * **BETA** Whether the link opens in a new tab.
   */
  public UpdateGuidelineDocumentLinkInput openNewTab(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("openNewTab", v);
    return this;
  }
  /**
   * **BETA** How the link is displayed.
   */
  public UpdateGuidelineDocumentLinkInput displayMode(ch.brix.gql.client.frontify.enums.GuidelineDocumentLinkDisplayMode v) {
    values.put("displayMode", v);
    return this;
  }
  /**
   * **BETA** Position of the icon relative to the label.
   */
  public UpdateGuidelineDocumentLinkInput iconPosition(ch.brix.gql.client.frontify.enums.GuidelineDocumentLinkIconPosition v) {
    values.put("iconPosition", v);
    return this;
  }
  /**
   * **BETA** Icon taken from an asset id; `null` clears the icon. Mutually exclusive with `iconFileId`.
   */
  public UpdateGuidelineDocumentLinkInput iconAssetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("iconAssetId", v);
    return this;
  }
  /**
   * **BETA** Icon taken from an uploaded file id; `null` clears the icon. Mutually exclusive with `iconAssetId`.
   */
  public UpdateGuidelineDocumentLinkInput iconFileId(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("iconFileId", v);
    return this;
  }
}
