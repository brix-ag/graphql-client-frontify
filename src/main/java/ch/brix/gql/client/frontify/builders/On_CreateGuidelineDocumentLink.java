package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelineDocumentLink extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelineDocumentLink() {
    super(new ch.brix.gql.client.On("CreateGuidelineDocumentLink"));
  }
  /**
   * **BETA** The link document's ID
   */
  public On_CreateGuidelineDocumentLink id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the link.
   */
  public On_CreateGuidelineDocumentLink title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** The link URL
   */
  public On_CreateGuidelineDocumentLink url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA** Whether the link opens in a new tab.
   */
  public On_CreateGuidelineDocumentLink openNewTab() {
    _add_field("openNewTab");
    return this;
  }
  /**
   * **BETA** How the link is displayed.
   */
  public On_CreateGuidelineDocumentLink displayMode() {
    _add_field("displayMode");
    return this;
  }
  /**
   * **BETA** Position of the icon relative to the label.
   */
  public On_CreateGuidelineDocumentLink iconPosition() {
    _add_field("iconPosition");
    return this;
  }
  /**
   * **BETA** Icon asset ID, if the icon comes from an asset.
   */
  public On_CreateGuidelineDocumentLink iconAssetId() {
    _add_field("iconAssetId");
    return this;
  }
  /**
   * **BETA** Icon file id, if the icon comes from an uploaded file.
   */
  public On_CreateGuidelineDocumentLink iconFileId() {
    _add_field("iconFileId");
    return this;
  }
}
