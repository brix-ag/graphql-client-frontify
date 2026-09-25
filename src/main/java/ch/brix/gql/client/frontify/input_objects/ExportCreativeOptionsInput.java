package ch.brix.gql.client.frontify.input_objects;

public class ExportCreativeOptionsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Format` of exported file.
   */
  public ExportCreativeOptionsInput format(ch.brix.gql.client.frontify.enums.CreativeExportFormat v) {
    values.put("format", v);
    return this;
  }
  /**
   * `Quality` of exported file. Supported only for `JPG` `Format`.
   */
  public ExportCreativeOptionsInput quality(ch.brix.gql.client.frontify.enums.CreativeExportQuality v) {
    values.put("quality", v);
    return this;
  }
  /**
   * `TransparentBackground` export parameter. Supported only by `PNG` `Format`.
   */
  public ExportCreativeOptionsInput hasTransparentBackground(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("hasTransparentBackground", v);
    return this;
  }
  /**
   * List of pages to export. If provided, validates that all requested pages exist in a template before export. If not provided, all pages will be exported.
   */
  public ExportCreativeOptionsInput pages(java.util.List<ch.brix.gql.client.frontify.scalars.IntScalar> v) {
    values.put("pages", v);
    return this;
  }
  /**
   * **BETA** Frames per second for the exported file. Supported only for `GIF` (possible values: 10, 12, 15, 24, 30) and `MP4` (possible values: 15, 24, 40) `Format`.
   */
  public ExportCreativeOptionsInput fps(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("fps", v);
    return this;
  }
  /**
   * **BETA** Scale percentage for the exported video. Accepts values between `50` and `200`. Supported only for `GIF` and `MP4` `Format`.
   */
  public ExportCreativeOptionsInput scale(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("scale", v);
    return this;
  }
  /**
   * **BETA** If true, the exported GIF will not loop. Supported only for `GIF` `Format`.
   */
  public ExportCreativeOptionsInput noLoop(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("noLoop", v);
    return this;
  }
  /**
   * **BETA** If true, a static fallback image will be generated along with the exported HTML. Supported only for `HTML` `Format`.
   */
  public ExportCreativeOptionsInput fallback(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("fallback", v);
    return this;
  }
  /**
   * **BETA** Specifies the ad network for which the HTML is being exported. Supported only for `HTML` `Format`.
   */
  public ExportCreativeOptionsInput adsNetwork(ch.brix.gql.client.frontify.enums.CreativeExportAdsNetwork v) {
    values.put("adsNetwork", v);
    return this;
  }
  /**
   * **BETA** If provided, a click-through URL will be embedded in the exported HTML. Supported only for `HTML` `Format`. Only secure HTTPS URLs are accepted.
   */
  public ExportCreativeOptionsInput clickTagUrl(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("clickTagUrl", v);
    return this;
  }
}
