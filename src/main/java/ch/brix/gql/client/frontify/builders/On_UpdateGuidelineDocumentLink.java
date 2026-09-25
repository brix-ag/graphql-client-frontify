package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelineDocumentLink extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelineDocumentLink() {
    super(new ch.brix.gql.client.On("UpdateGuidelineDocumentLink"));
  }
  /**
   * **BETA** The ID of the updated document link.
   */
  public On_UpdateGuidelineDocumentLink id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the link after the update.
   */
  public On_UpdateGuidelineDocumentLink title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** The link URL after the update.
   */
  public On_UpdateGuidelineDocumentLink url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA** Whether the link opens in a new tab.
   */
  public On_UpdateGuidelineDocumentLink openNewTab() {
    _add_field("openNewTab");
    return this;
  }
  /**
   * **BETA** How the link is displayed.
   */
  public On_UpdateGuidelineDocumentLink displayMode() {
    _add_field("displayMode");
    return this;
  }
  /**
   * **BETA** Position of the icon relative to the label.
   */
  public On_UpdateGuidelineDocumentLink iconPosition() {
    _add_field("iconPosition");
    return this;
  }
  /**
   * **BETA** Icon asset ID, if the icon comes from an asset.
   */
  public On_UpdateGuidelineDocumentLink iconAssetId() {
    _add_field("iconAssetId");
    return this;
  }
  /**
   * **BETA** Icon file id, if the icon comes from an uploaded file.
   */
  public On_UpdateGuidelineDocumentLink iconFileId() {
    _add_field("iconFileId");
    return this;
  }
}
