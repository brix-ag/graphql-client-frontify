package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for create a guideline document link
 */
public class CreateGuidelineDocumentLinkInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The parent ID to create the link in (Guideline or Document Group)
   */
  public CreateGuidelineDocumentLinkInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * **BETA** The title of the link.
   */
  public CreateGuidelineDocumentLinkInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** The link URL
   */
  public CreateGuidelineDocumentLinkInput url(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("url", v);
    return this;
  }
  /**
   * **BETA** Whether the link opens in a new tab.
   */
  public CreateGuidelineDocumentLinkInput openNewTab(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("openNewTab", v);
    return this;
  }
  /**
   * **BETA** How the link is displayed.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public CreateGuidelineDocumentLinkInput displayMode(ch.brix.gql.client.frontify.enums.GuidelineDocumentLinkDisplayMode v) {
    values.put("displayMode", v);
    return this;
  }
  /**
   * **BETA** Position of the icon relative to the label.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public CreateGuidelineDocumentLinkInput iconPosition(ch.brix.gql.client.frontify.enums.GuidelineDocumentLinkIconPosition v) {
    values.put("iconPosition", v);
    return this;
  }
  /**
   * **BETA** Icon taken from an asset ID; `null` clears the icon. Mutually exclusive with `iconFileId`.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public CreateGuidelineDocumentLinkInput iconAssetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("iconAssetId", v);
    return this;
  }
  /**
   * **BETA** Icon taken from an uploaded file id; `null` clears the icon. Mutually exclusive with `iconAssetId`.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public CreateGuidelineDocumentLinkInput iconFileId(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("iconFileId", v);
    return this;
  }
}
