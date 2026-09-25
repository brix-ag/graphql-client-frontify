package ch.brix.gql.client.frontify.enums;

/**
 * The fit mode for a background image in a guideline page section.
 */
public enum GuidelinePageSectionBackgroundFit {
  /**
   * The background image will fill the section, potentially cropping it.
   */
  @com.google.gson.annotations.SerializedName("FILL") 
  FILL,
  /**
   * The background image will be resized to fit the section.
   */
  @com.google.gson.annotations.SerializedName("FIT") 
  FIT;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
