package ch.brix.gql.client.frontify.enums;

/**
 * The style of the border for a guideline page section. Possible values are: solid, dotted, dashed.
 */
public enum GuidelinePageSectionBorderStyle {
  /**
   * A solid line border.
   */
  @com.google.gson.annotations.SerializedName("SOLID") 
  SOLID,
  /**
   * A dotted line border.
   */
  @com.google.gson.annotations.SerializedName("DOTTED") 
  DOTTED,
  /**
   * A dashed line border.
   */
  @com.google.gson.annotations.SerializedName("DASHED") 
  DASHED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
