package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreativeColor {
  /**
   * ID of the `Color`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IntScalar id;
  /**
   * Name of the `Color`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * Name of the palette that the `Color` belongs to.
   */
  @com.google.gson.annotations.SerializedName("paletteName")
  private ch.brix.gql.client.frontify.scalars.StringScalar paletteName;
  /**
   * RGBA color value of the `Color`.
   */
  @com.google.gson.annotations.SerializedName("color")
  private ch.brix.gql.client.frontify.objects.RgbaColor color;
}
