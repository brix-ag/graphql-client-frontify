package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateGuidelineDocumentLink {
  /**
   * **BETA** The link document's ID
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the link.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA** The link URL
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.StringScalar url;
  /**
   * **BETA** Whether the link opens in a new tab.
   */
  @com.google.gson.annotations.SerializedName("openNewTab")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar openNewTab;
  /**
   * **BETA** How the link is displayed.
   */
  @com.google.gson.annotations.SerializedName("displayMode")
  private ch.brix.gql.client.frontify.enums.GuidelineDocumentLinkDisplayMode displayMode;
  /**
   * **BETA** Position of the icon relative to the label.
   */
  @com.google.gson.annotations.SerializedName("iconPosition")
  private ch.brix.gql.client.frontify.enums.GuidelineDocumentLinkIconPosition iconPosition;
  /**
   * **BETA** Icon asset ID, if the icon comes from an asset.
   */
  @com.google.gson.annotations.SerializedName("iconAssetId")
  private ch.brix.gql.client.frontify.scalars.IdScalar iconAssetId;
  /**
   * **BETA** Icon file id, if the icon comes from an uploaded file.
   */
  @com.google.gson.annotations.SerializedName("iconFileId")
  private ch.brix.gql.client.frontify.scalars.StringScalar iconFileId;
}
