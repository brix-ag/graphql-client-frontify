package ch.brix.gql.client.frontify.interfaces;

@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.BrandEssentialsAdobeFontStyle.class, ch.brix.gql.client.frontify.objects.BrandEssentialsGoogleFontStyle.class, ch.brix.gql.client.frontify.objects.BrandEssentialsMonotypeFontStyle.class, ch.brix.gql.client.frontify.objects.BrandEssentialsSelfhostedFontStyle.class})
public interface BrandEssentialsFontStyle {
  /**
   * **BETA** The name of the font style.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
  /**
   * **BETA** The weight of the font style.
   */
  ch.brix.gql.client.frontify.scalars.IntScalar getWeight();
  /**
   * **BETA** Whether the font style is italic.
   */
  ch.brix.gql.client.frontify.scalars.BooleanScalar getIsItalic();
}
