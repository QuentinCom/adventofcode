package org.owl.y2024.d4;

import java.util.List;

public class Year2024Day4Part2 {

  private static final String INPUT_MATRIX =
      """
XMMXMASAMSAAAXSXMASAMSMXSAMXMMMMXMSSSSXMAMSAMXMSXMMASAMXMMMMAXMXMSMSMXSXMXSMXXSAXXMSXSMXXXSASXSMMSSSMMXMAMSMSSSMXMAXXXXSSXXXXMXSXAXMASMMSASM
SAMXXAMXMAMAMMMAXSAXMAAMSMSXSAXMAMAAASAMXMSASAMMAMXAAASAMAASAMXXSAAAMMSAMASMMAMASMMSAMXSXMSASAAXAXMAMMAMAMAAAAAAAXSMMMMMMMMMXMAMXMAXXMAXSAMX
MAAAMSSMSASASASXMXMXSMSMXAAAXAXSAMMSMXXMSXSMMAMSAMMMMAMASXMMXMMMSMSASASAMASASAMAMAAMAMASXAMAMXMMMXSAMSMSASMMMSMMMXAAXAAAAAAXAMASAMAASMSMMXMX
SMMXXAAAMAXASAMSAXXXAMXMMMMMMAMSASAXMXSSMMXASAMMXMASMMMMMMAMXMAMXXXMMMXAMMSAMMMSMMMMXMASMSMAMAXAXAMXMAAXXMXMAXAAMSSMMSSSSSMSMSASMMSXMAMMXSSX
XXMMSMMMMSMMMXMMMMXAMMAMXMASXSXSAMXSMAMAAXMMMASMASMSAAXSASAMAXSSSMXSASMSMXMMMMAMAAAAXMMXAXMAXXXSMASXSSSXSXXMAMMMMAMXAAMXAXAAXMASXAMAMMMSAAXX
MXMAAXXXAAAXXMXSXMASXSASMMSMAAAMMMXAMXSSSMMAMXMMASASXMMSASMXSSMAAAASXSAMXMAMXMAMXMMAXSAMSMSSXSAXMAMMAAAAXXSMSSSMMMXMSSSMSMSMMSASMMMAMXAMMMMS
MXMXSSXMSSSMSMMMASAMASXMAXAMXMAMAMXXMXMAMMSAXSAMXSAMAMXMAMAAMAMSMMMMMMAMMXAMAMMSMSMXMAXSXAXAAMAMXSMMMMMXMASAAAAXXSAAMAXAAXMXMMAMASMSMMXXXAAM
MASAMXXXAAAAXAASXMXSASAMSSMSMSMMASXMMAMAMMMAMSASAMXMXMAMAMMMSAMXXAAAAXAMMSSMSSXAASAMXXSAMXMMMMASXMAXMAXAXAMMMSMMASXSMMMSMSXAAXXMSMMAAMXSSMSS
MAMASASMMSMMMSMSMSXMAMXXAAXAAXMSAXAXSASASAMMMMAMXXAXSXXSXSMASAMXSSSSMSASAXAAXMXMSMXXXMXXAXMSXMMSASXMSSSMMMSMMXAMXMMMASAMXSXMSMMXXXSSMMAMAMAM
MASXMAXSAAMSXMAMAMAMAMXMMSSMSMMMMXMMSAXXSXSASMMMSMMASAASAXMASAMXAXAAMSAMXSMMSAAXAXMMMMAMMMXSAMSMMMAXAMMXMAMAAMXSAMASAMAXAMMXAXMAMMXAXMASMMAS
MXXAMXMASMMSASAXSXMMASAAMAMXAAMAAAMXMSMMXASASAAAXAMASXMMAMMAMAMAMMMMMMXMASXAMXMSMMXAAXASXAAMAMAAXSXMMSMAMASMMSASASXSSSSMSSSSMMSASXSXMAXMXSAX
SSSSMSAMXMASAMMXXAXMASMXMASMSSSSSMSAAMXMMXMAMXMMMXMASAMXSMMAXSMMSASAXMSSXMMSSSMAXASXXSASMMMSAMMSMMAXMAXASMSXSMMXAMMSAXXAAAAXAASAMASMMXSXAMAS
XAAXASMXAMAMXMMAXAMXXMXSMXXXAMXMAAXMMMAMXMMSMSSSSSMXSAMAMXMXXMAAXASASMAMAMSXMASMMMSAAMMMAAASXSMXXXAXXMSXSASMSASMXMSMMMMMMSMMMMXAMAMAXASMMMXA
MMMMMXSSSSSMXSMXSSXXXAAXXSSMSMAMSMXSASMSAMXAAXAAAXMASAMASMSMAMMMMMMAMMAXAMXAXAMXAMMMMXMSSMMSAAAMMMMMMXMASAXAXAMXXMXAXXSAAMAMXMSAMXSSMAMAXXMA
ASXMMAXXAAXMMAMAXMASMMMSMMAAXXMMAXMSAXASAXSMSSMMMMMXMAMXXAAAAXAXAAMXMXMSMSSSMMMSAMXMSAMMAMAMAMAMXAAAMAMMMMMSMMMSSMSMMMMMMSAMAMMSMAMXAMSMMSAS
XAAAMMSMMMMXMAMXXSASAAAXASMMMAMSASMMSMMMSMAXAXMSXXMAXXMSMSMSMXMSXMSMMXMAMXAMXAXXSXMASXMSAMXSASASXMSXXAXAAAAXAXAXXAAAAAAAXSAMXSAAMASMSAAMAMXA
SSSMMMAAAXXAXSXSAMXSXMMSMMMASAMSSMAAAMAAASXMAXMXMAMMXMAAAAXXAMXMXASAAAMXSMMMSXSAMSSXMXMSAMXSASASAMAMSMMSSMSSXMASMMMSXSMSXSXSXMMMXASAXMXMASMM
AAAMAMSSMSSMSAXMMMMMASXXMMSAMMXXAXXSMSMXXMMXSXMAXXAASMSMSMSMMMAAAXSAMXSMMASXAAMAMAMAMMMXMSMSXMXSXMAXXSAXAAAAAXMAMAAXAXXMASAXAMXSMASAMXMXAMAX
MMMXAXXMAXMXAMMSAAASXXMMXAMMSSXSAMMMMAMXXSMAXASMSSMMSAXAAAAAAMMXMMMMAXAAMAMXMXSAMASXMASAMXAMXSAMXMSSXMSSMMMSSMSAMMSMMMMMMMSMAMAXMAMAMXAMSMMS
XMXSSXSMSMSXXXAXXXXXMMMSMMSMAAXAXXAASXSAASMXSAMAAXAXMMMSMXSSMMMAXXAMXMSMMASXXASASASXSXSMMMSMAMASAAAMAAAMXSXMXXMAMXAMXAAXSAAXAMXSMMXMMXMAAAXA
XAAXMASAMAAMSMSSXSSMAMAAASMMMSSMMSSMSAMMXMAMMAMMMMSMXSAXAMMAMASXSSSSSMAXXAMXSASXMAMMMAMAASAMXSASMMASMMMSAMAAXSMSMSSSSMSAMSSSMSAMXAASASXSSSMM
SMMSMAMAMMMSAAAAAAMSMMMMMMXXSAXAAXMMSASMSMSMSSMSMXXAMXSMXMSAMMAAAAXAAMAXSAXAXXXXMXMAMAMMMSASMMAXXMAXXSXMASMMMXAXMAXXAAMAAAMAMXXSMSMSAXMAMXXX
XSAXMASMMMMSMSMMMMXSMMXSAMXSMMSMMMMXSAMAAAXAAMAXSAMAMSMSXAMXMAMMMMMXMMAXSXMAXXMXMASMSMSMXSAMAMMMASASMXASAMXXAMSMMMSSSXSMMXSXMASMMMAMAMMXSAMX
SMMMXXXMAMXMXXAXXXMXAAAAXAMXAXSXMMSAMAMSMSMMAMMMMMSAMXASMMMSMMXXAXMXAMXXMXAMSMSASMMAAAMAMXMSMMAMMAAAAMXMSSSMMXMAMXAAXMXMMMXXMXMAAMXMMMXAMASA
AMAAXSSSSSXSAMMMMXAXMMSSMMMSMMSAMAMXSXMMMXXSAAAXAXMASMMMASXSAXMMMSSMSMSASMSMSAAASXSSMSMSMMXSXSASAMMMSMMAXMAMXAMAMMMSMSASASMSSSSSMSSSXSXMSAMM
MMMXSAAAAXAMMSSSMXSAAAAAMXAAMASAMMXMMXXXAMASMSASMSXAMAXSXMASXXAASXMAAASAXAMXMXMMMAAAXXMAAAAMMMASMMMAMAMMMSXSXXXASMMAAXASXSAMXAAXSAXMASAMMXMX
XMAMMMMMMMMSAMAAAAASMMSMAMSSSMSMMSSMMASAAMAMMMMAASMMXSMMAMMMAMSMSAMMMMMXMSMAMXMMXASMMASMSMXSXMAMXSMAMMMSAMXMASXMMAMMSMMXXMMMMMMMMXAMXMASASXM
MASXAXSXXMASMMMMMMXMMAXXSXAAAAMXAAMAMASXMMXSASXMMXAMAXASMMSMAMAAXXMASMMSAASAMAMMMMMXSXMXXMMSMMMSASMMMSAMAXAMXMASMMMAXAXMASAMAAAXXMXMXMSXXMAM
SAMMXSAMXMMSXMSSMXSSXXMAMMSSXMXMMMSAMXSAMXXMASXMMSSMMMAMXAAMMSMSMMSASAXMSXSMSMSAAASASAMXMMXXAAAMMSASMMMSASXMSSMMSAMASMSAMMASXSXSMASMMMMSMSXM
MASXMXMASMXXMMAAMAAXMXMASAXAXSAMSASASAMAXMMMXMXXAAAAXMXMMSSMMAAAMAMXMXAMAMSAAASAXXXMMAMAMSMSMMMSAMMMAAMXMAXXMAMAMXSAAAMMMSAMXMASAMXAAAAXMAAX
MAMXAAXXAMXMMMSSMMMSAMSMMMMSMMASMXXMMAMAMSAMXMMMMSSMMSMAXAXAXMXMSMMSMMSAXAMMMXMASXSSSMMAMAAXAMXMAMASMMMAXASMSAMXXAAMMXMAXMAMMMAMAXAMSMSSXSSM
MASXSXSAASXAAAXAXXAXMASXMAXAXMSMMAMSSXMSXSASMSAAXAAAAXMXMMSSMAAXXXAAXAXMMMMXMSMMMAAMASXSSMSMASMMMSASXXSAMXSASXMAMXSSXMMMXMAMAMSSMMXXAAXMAMXX
SXMAXAMMMMMSMSSSMMMSXASXSXSSMMMAMXMAAAMXASXMASXSSSSMMSXSAAAAMMMSAMSSMSSXSSMAMXASMMMMAMXAAAMXXMAAAMXMAASAMMMAMAMAXSAMMSAAMMSSMMAAMXSMMXMMXMAX
XAAAMAMAMAXAMXMMAMXMMXSXMAMAASMSMAMXSMMMAMAMXMAXMMXAXAASMMSSSMMXXXXXAXXAAXSAMXXMASXMMSMSMMMAMSMMMSAMXMSAMXMASXMAXMAMAMMMSAMAMMXSMASXXAAMXMSS
XXMSMMSXSXSXMAXSAMAXMASMSAMXMMAAAMMAMAXMMMXMMMSMMXSMMMMMXMAAAAMMMSMMSMMMMMSMXXSXXMMMAAAXMMMSMAAAXSXSAAXXMXMASASXXSMMXSAAMASAMMAMMMXASXMMASXA
MSXMAAMMSAMMSXXMMSMMSAMXSASXSMSMSXMAXMXASXXXAAAAXXMMASXSAMMSSMMAAAASAMXMXXMASXXMAXAMMMMXXAAAMSXMXSASMSMSMSMXSXMXMAAASMMMSXMXSMAMASMAMAASXMMM
AXAXMMMAMAMASMMXAAAAMASASXMASAMAMMSSSMSAMXMSMSMSMSAAXXASASXAXMXMSSSMMSASMSMAMXAXAXSXMXSMSMSSMMSXXMAMAAAAAAMMSXMXAMMMXXAAXASXXMMXAMMMMXMMAMSX
XMMMSMMMSAMASAMSSMSMSMMASAMXMMMAMMAAAXSAMXXSAMXMASMMSMAMAMMMMXAMXMXAASASASMMSSMMSXXAXAAXXXAXAAAMAMXMXMSMSMMAXAMASXSAXSMSMAMXXSSMSMSASMAMAMAA
MAAASAMXSXMXMAXMAMXAAXXAXMMMMMSMSMMSMMMASASMAMAMAMMAMMAMMMMXAXASMSMMMSAMXMAMAAAAMASAMSSMMMSSMMSAMXXSXMXAAAMSSXMAMMSAMXAAMAMXMXAAAAXAXXAMMMMS
ASMMXAMAXXAXXSXXXMMMMSMSSSXXAAAAAXAMMSSXMXXMAMMMMMMMSSSSXAMXSAAAAAAAAXAMXSXMSSMMSAMXMAAASAAXXAAMXMMMASMSMMXMAMSXSAMMMSMMXAMXXAMMMSMSMSSXSAAM
XXSMXSMMSSMXMAMSMSMSAXAXAMXSMSXSMMXSAAXXMASMXSAAASAMAXAAMSMAMMMMSSMMXSMMXMAXAAMAMMMXMSSMMMMSMMSXSXASXMAXXSAMXMMAMMMAXAASXSSMSXSAXAAAAXAASMMS
SXMXAXAMXMASMXMAAAAMMMSMMMAMMAAMXMAMMMSMSAXMASMSMSASMMMMMXMMSXMXMAASAMAAMXMMMSMAMASAMXAXXXXSAMXAXSMSMMXMXXMXMSMXMASMSSXMAAAAAAXXSMSMSMMMMAXM
SAMMMMAMMMAMXMSMMMXMASXAAMMSMMSMAMMSMXAAMXSXXXAXAXMMXSAXXXSXMASASMMMASAMXASXMAMXSASASMSMMMMSAMMXMMXMXMAXSSSSMAAASXSAMXMXMSMMMSMAMAAXAXXASXMS
SAMASXMMXMASXMAMMXSMMMMSMSAAAMXMSMMAXSMXMASMMMSMSSSMAXMMMXMASASMSAASAMXSSXSAMASMMASAMXAAMSASAMMMSMAXXSXSXAAASMSMSAMMMASAAAMXAAMAMSMSSXSXSAAA
SAMAMAXSAMMSMSAXXAMAXAAXXSMSSMAXMASMMMSAMXSAAXAAXAAMXMXAMAMXMXSXSXMMXSAXXMSMMASAMMMXMXSXMAXXAXXAASMMMMSAMMSMMMXXMMMXSASMSMSMSMSXMMAXMASMXMSM
SXMMMSMSASASXSMSMASXMMMSASAMXMAMSAMXAAAXAASMMSMSMSMMXMSSMXMAMXMMMXXXXMXSSMMAMAMXMAMMSAMXXMASMMMMMASAXXAXMMAXAMXXMAMAMMSXXAXXMXMMMMXMMMMAMXAX
MMMXAMMMXMASAMAXMAMAMSAMXMXMXAMMMSSXMXMXMAXXXXAAXMASAAAAMSSMSXXAXSMMXSAMXASXMMSASMSMMASMSXMAAASXSASXSMMSSXMSSSSSSSSXSASMMMMMMXSAMMMMAXASAXMS
MXSMMSASAMXMAMSMMSSMMMXXMXXMAXAXAXMASAMXSAMSXSSMXSASMMMSMAAXAXSMMSAMXSAMSMMSAMXXMASASAMXAAXXSMMAMASMMAXAXAXAXAAAAAAASAMXAXAAXMASAAASASMMSSXM
XAXAMXXAMXAMAMAAXAAASXSMSAAXMASMXMSAMASXMAXSAMXSAMXXXMAXMXSMMAXMAMAMXXAXXAAMMMXAMAMXMASXMMMAMAMSMAMMSAMXSSMMSMMMMMMMMAAMMMSXMXMASMMSAMAAAMAA
MMSSMXXXXSXSASXSMMSMSAMASMSMMMMAXMASXXMXMMAMXMAMXSXSAMXXSAMAXMSMAMSMSSSMSMMSMMXSMXMXXMXMAASXMAMXMSSMSASXMMAXMAMXXSAMSSMXSAXASMXMAXAMXMSMSXSM
MAAAXMMMMMMMASAXAXXXMAMMMXAAASMSMSAMXAMMSAMAMMMSAMXAMMXXMASXAASMMXMAMXMAXMASAAAXMMMSSMASXMSAMSMMXMAMSAMXMSSMSMSMXMAXMAMXMASAMAASMSXMSMMAXAAS
MSSSMSAAAAASMMXMASXXSAMXXMMSMXAAAMASXSMAXAXXMAMXAASXSMSMSMMMMXMAMAMAMSMMMMMXMMXMASAAAMAMAAMMAMXMASAMMAMMXAXAAAAMASXMSAMSMAMASMXAAXMXAAMAMMMM
MXAAASXSXMMMAMXMAMXAXXSAMXMAXMSMSMMMXAMMSXMXMSSSSMMAAASASMAXMAXAMASXMXMASMSXSAXMXMASMSMSMXMMAXASXSSSXSAMXAMSMSMMAMXASXMASXSAMXMMMMMSSSMSSXMS
SMSMMMXMXSSSSMAMXSSMSASAMXMAXXAMXAXXSXMASMMAXXAAXAMSMMMAMMAMSXSASASMMASMSAAAAAMSSSXMAAAAXSXMMSMMMXAXAMMAMXMXAAXMMSMMMSXMXMMMSXMAAAAXAXAAXAAX
XAAAAXMMAAAAXMXSAAAAMAMXMMMSMMSXMAMMMAMXSASMSMSMSAMXAXMMSAXXAAAXMMSXXAXAMXMMMSMAAAAMSMMMMMXSAAAAAMMMXMASXSSMSMXMMAAAAMXXMXAXMASASXSMAMMMSMMS
MSMSXMAMMMMMMMASMSMXMAMSXMAXASAXSASXSASMXMAAAAAMSMMXXXXAMXXMMSMMMAMXMSSMSMSXXXMMXMXMXXXAXXAMMSMMSAXAMXXMAMXAXXASMMSMASMMAMMSSMMXXAMMXMAMXAAS
AXAXMMXXXXAMAMASAMXXMAXSAMXMXMAXSAAAMAMAXSMXXSSXSAXSMMMSSMMMAAMSXMXAAAAAMASAMXSASMMSMSSSSMASXMMMMMXSSSMMAMSMMXAXAMAMXAAXSAAMAMMXMMMMSAMSMMMS
SMAMAASMMSMSAMAXMSMMSMMSAMSSSMMMMMMSMSMMXXXXMAXASMMXAAAXAAMMXSAMAXSMMSMMMMMAXAMXAMXAAAXAXMASAMXASAXXAAAXXXAMMXSSXMAMMXSMMMMSAMXAMSAMXAXMAMXX
AMXMXMAAAAASMMMXSAXMAMAMAMXAAAASXMXXAXAXSAMSMAMMMXSSSMSSSSMXAMASXMXAAMMMSSSXMXSSSSSMSMMMMXAMAMSASMMMSMMMSSMSSMAAAMXMSMMAXXAMASXMMSXMMAMSSMSA
MSMMASMMMMXMAAXXSAXSAXAMMMMMMMMSAMXMAMMMXAMXMAMXMAXMXAMXAAMMXSAMMMMMMMAAXMXASXXAAAMXAAMXAXXSSMMXMAMAAXAAXAXAXMASMMMAAAMXMMMSMMASAMMSMSMAAAXS
XAASASXSASAXSMSMMSMSSSMXMASXSAXSMMMSAAAMSSMXMASXMSSMMSMMSMMSMMASAAMSMSMMSMSAMXMMMMMSSSMXMAAXXXXMSAMSSSMSSMMMSSXXMXASMXMAXAXAXMAMASAAAAASMMMM
XXXMXXXSASXXAXXAAMMSASAASAMASAXXSAASXXAXAMAMXAMAXAAMAXAAXXMAASAXXXMAAAASAXAASXSAAAXMXMMAMSMMMSMAMXMMAXXAAXXAAXMAMXMMXAMSXMSAXSASMMXMSMXXSAAM
XSAMMSMMMMXAMXMMMXMMAMMMMASXMMMMMMMSMMSMASXSASMSMSSMSSMMMASMMXASXSSMSMMMXSMXMAMASXSMSSMMMAAAAMMMMXMMXMASMMMMSXSAMXSSSMSAAMMMMSASMSAMXXXASMMS
XAAAASXMASXXXAXAMASMSMSXSAMXSXMXAMASMAMMMMXSAMAXAAAMXMMAMAMXMXMAXXAAAMASAMXAMXMAMMXXAMASXXSMSSXMASXMAMXMMMSXMXSASXSAAXXMXMASAMAMASMSMSMMMSMA
XSMMASASXMXXSSSMSMSAMAAXMAMAXAMSXSAMMASAMXAMAMXMMMSSSMSSSMSXAXXXXSMMMSASASMMSAMASXMMASAMXMAAAMAXXAMSSMXMASMAMMSAMXMMMXASXSXMXSXMAMXMAAMAAAXM
MXAXAXXMAMMMAAXAAXMAMMMXXSMMSSMAXMASMASAMMXXAMASXXAAAAAAAAAMMSMMXMASXMXSAMMMMASXSMMAXMAXSAMMASMMMMAXMXAMMMMAMAMMMXXAXMXMAMMSAMMMXSSMSMSMSSSX
AMSMSSSMXSAAMMMSMSSXMASAAXSMAXMASMMXMMSXMASMASASXMMSMMMSMMMXAAAXXSASAMAMMMAAMAMXXMASXAMASMXXXAMXAMMMMSMSSXSASMASXXMAXAAMAMAMASXXMXAAAAMAMXAX
SSXAMAXXASMSXXXAMAAASASMSMAMXMAMXAAXMAXAMAXSAMMSAMAXMAMXXXXMSMSMAMAXMMASASMSSSMMMMMXAASAMXMXMSSSSXSAMXMAXXMAXXAASASXSSXSAMXSMMMSAMMSMMMSMMSA
XAMXMSMMASXMMMXAMMSMMASXMMAMMMSMSMMSMMSAMXMMXSXSMMSSMMXMXMAXMAMMSMSMASMSASMMAXMAAAXXSXMASASXAAMXAASXMAMXMMXSXSSMMXAAAAAAAXAMXAXASXXAAAXXAAAM
MMXMAMAMXXMMAMMMMXXXMXMXMSMSAAAAMAAXAAXAXXMSMMAMXMXAXMASAMMXMXXAAAASAMXMMMAMAMXMMXXXMXXMXAMMMMMMMMMASXMSAMAMMMAXMMMMMMSMMMSMSMSMXMMSXMSMMMMX
AXMAMXXMMSMXXMMSAMXMSASAXMASMSXSSMMSMAMMMSXAXMAMSSMMMSXSAXMAXMMSMSMMMSAMASXMASXSSSMAASXMMSMMSSSXMXSXMAASAMXSASMMXAXAAXMAMMAAAAAXAAMAMSMMASXM
SMSSXSASAXMASMXMASMXSASXSMAMXMXAAXXMASXAAXMMSXSXSAMSMMASXMSXXAMAXAXAASASMSXMXAXAAMXXAMXMAAAMAXMAXAXAMXMSXMXSXSXMSMSMSMSAMXMSMSSSMMMAMAAMASAS
XAAAASAMSSMASMAXSMMAMXMAMMMXASMMMSSMAXSMXSAXMAMXMMMAAMAMAMAASMMMSMSMMSXMAMXSMMMMMMSSSSMMMSXMMSSMMSSXMMXMMSXSAXMAXAAMAASMSXAMAAMAXSSSSSSMASXM
MMMSMMAMAXMAXMAMXAMXMASAMSSMMSAXAXAMAMAMASMSMAMASASXSMASAMMMMMAMXXXXASAMXMAXAXMASAMAAAXSXXXAXAAAAXAAXSASMAAMSMMAMXMSSXMAMMMMMMXAMXAMAAXMMMAM
XMXMXSXMXSXSSMSMMAMXSASAXAASASMMSSXMSSXMAMMAMAMXXAXAAMASMMXAMSXMMMSMMMXSXMASMMSASAMMMMMXAXSMMXSMMSSMMSASAMMMMXMMSAAXXASXMAAAXAMSSMMMXMASMSSM
XAAXAMASMMXXAMXMMMMXMMSXMXSMXMMAXAASXSAMSXSASXSSMSMSMMXSMMSAMAMXAAAAASMMASXSXAMXSXMASAXMMMXMAXXMMXAXXMAMMXXAXXXAXMSMSMMASMSSMMSAAAXSAXXAXAMX
MMSSMSXMASXMMMSXASMSMAMMSMMMAMXSMSMMASMMMAMXSAMXAMAMXSXXAASMMAMSMMSSMXAXAMMMMMSMMASXMXXAASXMXSMASMMMXMXMAXSAMSAMXXAASXSMMXAMMMMXMMMMMSMMMMSS
XXAAXXASMMSAAAXXASAAMMSAMASMMXMXMXAMMMMAMXMASASMMMSMAMAMMMSMMAMXAAMAMSMMAXASAXAXMMMXSMSSMSAAASMMMAXSMXSAXXMAMAAXAMMXMXMAMXMASAASXSXSAAAAXMAX
MMSSMXMMAASMMMSAMMMMMXMXSAMXSAMASMMXSXMASAMXMMMAAAAMMSSMSXXASMSMMMSAMAMMXSASXSMMSAMMAAXMAXMMMMAXMMMXAAMAMXMAMMMMMMMXMXSSMXXASMSMMSAMSSSMSMAS
XAMAXSMMMMSMSAMAMSSXAXSAMASAXASAMASAMAXAXASXAASXMSSSXAAASMMAMAAXSMSAMXSAAMMMMXAAMASAMMSMSMXMSSMMSAAMMMXAAMSSSXSXSASMSAAAMXMASXAMAMAMAMAMMMMS
MSSMMAAAMSXXMAMMMASMMMAAXAMMMMMMSXMASAMSSMMXSXSAAAAXMMMMMASMMSMMMMMAMAMMXMXAMMMMSAMMXMSAMXMAAAXASXXXMSXMSMAMAAXAMAXAMMXMMMMXMASMSSXMASAMXMSX
XMAMMXMMSAMMSSMMMASMAASMMSMSMSAXMMSAMXSAAAAMMMMMMMSMMXSXSMMAAMXMAASAMXMXAMMMSAAXMXMMMAMXMMSMXXMASMSAMXASXMMSMSMSMXMSMXAXAAMAMXXAMXMXASMSAMXM
SAMASAASMMAAAXAAMMSXSXMMXXAAAMMMSMXMXMAXSMMSAAXSAMXAXXXASASMMSASXXSMSXMMASAASMSSMSSSMXAXMAMMSMMAXMASMSMMAXMAMAAMMXXXASMSSXSASMMMMAMMMSASXSAA
MAMASXSMMXMAXSSMSAMAMMAMAMSMMXAAAXMMMSAXXXAMXMXSASXSMAMXSMMMAMMSMAXXMAMSASMXMAAAAAAAXMASMMXAAAMAXXAMXAMSMMSXSMSMASXMAMAAAAMASXAMMSSSMMAMAMXS
XAMMXMXAXMAMMAMAXMMAMMAMAMXMSXMMXMAAAMXSMMMSSMMSAMAAMXSXMAMMAMASXMSMSAMMXMMXXXSMMMSMMMAXXMMSSSMSXMMSXXXAMXSAXMMMAMMAXMMMXMMAMMSMAAMAXMAMAMMX
SMSSMMSAMXAXMAMASXSAXSASMSAMMXSXMASMSSMMAAAAMAAMAMSMMAXAAAMSMSAMAXAAMASXAMSMMMMXAMAMAMXSXMAMAAAAMSXSAXMAXAMXMXMMXMAXMXXMSAMMMAXMMSSMMSMSMXAX
AXAAAXXMMMSMSXMXAAXAMXMSASAMXAMSSMXAAMAXXMSMSMMMXMAXMMSMMXMAAMXMASMSMXMXXSAMXAXXMXAMXSSMMMSSSMXMAMASASMXMASAMAMXMMSMSXAXAMXSMMSXXMAMMAMAAASX
MMSSMMSASAMXSAMXMSMMMAXMAMAXXXXAMXMMMSMMXMMXMXMSMSMSAAMAAXMMMXMAXXAXMAMXXMXSMSXSSSSMXSAAAAMXAXSXSMAMAMAASAMMSAXXXAAAMXSAMXASASXXMXSMSASMSMMA
XAXAAASXMASXMAMSAAAXSSSMSMASMMMSSMXXMAXAAMSASASAAAAMMMSMSSXXSAMXSMXMSSSMSXAMAXAAAAAMMSSMMSSSMMMMXMASMMSMMAXXAAMSMMMSXAXAXMSSXMMMMAMASASAMXXX
MSSMMMXAXAMASAAXSMSMMAAAXMASAAXAAAXAXAAXAXAAMMSMSMSMAXAAMXAXSASXSAAAXXAAXMMMAMMMMMMAMXXMAMXXAAMXSMXXXMXSXMASMSMAAAAMMMSSXMAMMAASMAMAMSMXMASM
MXXXAXSSMASXMMSMXMAMMSMMMMASMMMSSMAMMSMMSMMSMXXMXAXXAXMXMMAMMAMMSXSSSXMMMMXMASMXMXXXMAMSSMSMSMSXMXMASMAMXXXAAXMXMMMSAXXMMMMSMSASMSMSMAMSSXMA
SMMMMMAMMMMAXAXMASAMXXXMAMAXAMAXAMAXAXXAXAAMXXSXMSMMAMSAAXMMMAMMMAMMMAASAMXMXXXAMXMXMXMAMXXAAAMMSAMSMMXSAMSMMMSMMAAXXMAMXMMAAXASAMAASMSAMASM
MAAXMAXAAAMSMSXSASASMMMMSMSMSMXSAXXMMSMSSMMSMSMAAMAMAAXXXMSXSXSAMXMAXSMSXSMSXSSXMAMASAMMSMMSMSMASASMXMXMAMAAAAAAMMSSMMAMAMMMSMMMAMSMSXMASAMX
SSMSSSMSSXXAAMASASAMAAAXMAMAXXMSAMSAMSMMXXXAMAXXMSXMMSSSMAAAASAMXAMSMXASAXAAAMMASASXSAXXAAXXSXMXSMMAASMSMSMMMSSSMMAAXSASASXXAAXSMMMXMXSAMASX
AMAAAAAMAMSMSMAMAMXMMMSSMAMAMAAMAMSAXSASMMSXSMSMMXAXXAAAMXMMMSSXXMAXAMAMXMSMMASXSMSAMAMSMSSSMMSASAMSMXAAMMMMAXMAAMMSMSASASXSASXXMAMXMXMASXMX
MMMMSMMMAMAAXMXMASASASXAMXSASMMXMMSAMXAMAMMAAAAXMAMMMMMMMASXAXMMMMAMAMXMMXXXSAMXSAMXMAMSAMXAASMMSAMMAMSMMAAMSMSSMMXAAMAMAMASMMMXMAXMSAMXMAMX
XAAMXXMSXMMSMSXSXSASXAXMMMSAXAAXSASMSMXMXAMSMSMXSAMAXXXSSXSMXXMMSMASAMXSAMMMMASAMAMXMSMXASXMMMAXSXMSMXAAASXSAAXAXMSMXMXSAMXMAXAMSMSASMSMMSXM
SSMSAMMXSAAMAMAXXMXMMMSMSMMMMMXXMASAMMMMSMMAAAMASASXSMXMAXSMMSMAAXAXAMAXMASASXMXSAMMMMMSAMMSXSAMXXMAMSXSMMXSMMMMAXAAXSAMASXSSMMXAAAXSAMXAAAX
AMAMASMASMSMAMXXXMASAXAAASAAAAMSMMMAMMAAAASXSAMXSAXAAXMASMMAAAMSMSSXXSMSMMSASMMASXSAAMXMASAAMMSMSXSAMSXXASAXMASXMSMSMMASXMASAAMSSSMMXMXMASXM
XMMMAAMAMXAMXXSSMSASMSMSMSSSMXSAAMSAMXSMSMMMMMMMMXMSMMMAMASMMSAMXAMXAAAAMXMMMAMMSAXMSMXXSMMXSAAMAASMXMASAMMSXXMAXXAAASAMMSSXMSMAMAXXAMMMMMMA
XSXMSSMMSMMSSXAAAAXSAMAMXMXMAXSMMMSASAMAMMXAAAAAXAAMXSMXSAMXMAMAMASMSMSMSAXAMAMSMXMXXAMMXASMMXSSMMMSAMXMMMXMXMMXXASXXMMSAXAMXMMXMAMMAMAAAAMS
MMXMAMASAXSAMSMMXMSMMMAMMSMMSMMMXAXMMXMAMASXSSSSSMMXAXAMMXMMXXSXSSXAAXMASMSMSXSAAASMMASASAMXSAMXAAAXXXSMXMAMMSMSMMXSAMXSMMSAMXSSMSMXMASMSMSM
MXXSASMMAXMAMSXMMXMMXXASXMAAXAXXMSXXAXMAMMMAAAXAAMAMSMSMAAMMMXMXMXMXMSMMSXSXAXXMSMXASAMXXAXAMXSSSMMSMMXMAXMXAMXAAMAMXSAMAXAMAAAXAAMSSMXAXXSM
SAMMAMMMXMSMMMAXSASASXAXASMMSMMMMXAMXSSXSXMMMMMSMMASAAXMMXXAAAXXMASXMAMSMAMXMSMXMXSXMMSXSSMXSAMMXMAAXAAXSMSMASXSXMASAMASMMSSMSSMMMSAAXMAMASX
MASMMMXMAMAAAMMMSASAMXXSXMXAXAAAAMAMAAMAXMXMAXMXMMXSMSMSASXSSMXASASASXSMMAMAAAMAMAXMASAAAXAAXASAAMMSMSMMMAASXMAXXSMSXSAMXAXAAAMAXXMMSMMMMSMS
XAMMASASASXMMMSAMMMAMMMMMMMMMMSMXSAMXSMMMAASXSXAMSAMXXXMASAAAXSAMASAMXMMSMSMMSMSSSXSSMSMMSMMSSMMXXAAAXXAMSMMSMXMASAMMSAXMASMMMSSMXMAXAAASAMX
MSMSASXMASAASAMXSASXMXAAASAMMXMMMXAMAXASMMASAAMXMAAAASAMXMMMMMAMXXMMMMAAMXAMXXAMAMAXAAXMXXAXXMXMAMSSMMMSXXXAXMASXMASASXMAXXXAXAAMAMXMSMXSMXX
MAAMASAMSMXAMASMMXSASMSMMMASXAAAMSXMXMMMASXMMMASASMMXSXMMMSSXSASMSMAMMMSSSXSAMAMAMMMMMMMXSXMAXAXAAXAAAXXASMSMMXMAXXMMSXMSSSSSMXSSMSSMASAXMAX
MMMMXMASXAMXSAMASASAMAXMSSMMXMSMMAXSMSMMAMMAMXXMXMAMAXAMAMAAMXASAMXAXAMMAMMMMSXMSSXMASASMAXSMMMSMSSSSMSMXMAMAMSSSMMSAMAAAXAAAAAMAMAAXAMXAMMS
MSXSAMXAMAMXMMSAMMMAMAMAAAAAXXAMMMSMAAXMMMSAMMMMASAMXSMMSMMSMMMMAMAXSXSMAMASXMXSAAXSMSASMMMAAAAAAAAXMAAAMMAMAMMAMXXMASMMMSMSMMMSAMXSMSSMSAMX
ASAMMSXMAAAAXXMXSSSSMSSMSSMMSSMSSXAMSMSXAAMXMAASASASAAMAMSAAAAMSAMXAMXAMXSXSAMSMAMMSXMMMAXSMSMMSXMSXMSMSAMMSMMMXMMSSXMMSXAAAXAXXAMXAXAAAMMMM
AMXMAMAASMSMMSAMXAAAXAAXAMAAAAMAMSMMAAXMMMMSMMMMASAMXSXXSASMSSMMSMXASASXXSASMMAXAXAXXMXMMMSAMAXXAMXXXMMMMMMAMAMXAAASXAAMXMSMMASXSSMMMMSMMXAX
MMMXAXMMMAAMASASMMMMMSSMSSMMSSMAMMMSMMMMXSAAMSXMAMMMMMMMAXMXAMXAAMSMMAMMMSASMSXSAMMMXSAASAMXMXMSAMASMSASXMSMSXSSMMSSSMMSAMAMSMMMMAMXMXAAMSMS
XAASMXSAMSMMXSAMXXAAXXXAAMMAAAXXMAMMAAAAAMXMMAAMAXAAAAAMSMSXXMMXMAMAMAMAMMAMAMXMXAMAAMMSMASASXASXMASASASXMAAXAMMXMAMXMASMSXMAXAAXAMAXSMMMAAA
SMXSAAMMXXAXXMMMMXXAMMXMMSMMSSMXSAMXSMMMXXASXSXMXSSXSMXXAAXXSMSSSMSSMSSSMMAMAMXSASXMMMXXMXMAMMMMAMAMMMSMASMSMMMAAMXSXXXSXSXSMSXMSASAMXSAXXXM
XMAMMMMMSSMMMMAAASMSASMXSXMAXAAASXMAMXMASXMSAMXXXAAXMASXMSMAMAAAAAAAAXAMXXMSMAAXAMAMMSSMAMMSMMASXMASXMASAMMMMXAXXSMMMMMXAXAMXSAAMASXMAXMMMSX
XMASXMSAAAXSASMSXXAMAMAMSAMSSMMMSAMXSAMAMXXMAMASXMSMMAMAAMMXSAMSMMMMSMMMSMMXMMMSASXMAAAMASXMASMSXXMAXSAMXMAASMMSAXXAAASMMMXMAMMXMASAMXMSAAXM
MSASAAMMSMASASXXMMSMAMSMMAMAXAAAMAAMMMMSSMMXAMAXAAXAMAMMXMAAXAXXAXXSXAAAAMXXXAXMAMMMMXXSAMAXAMXSMMMAXMXMMSSXSAAMMMSXXMXAXASMMMMAMASMMAAMMXMM
XMASMMMMXAMXAMASXAAMXMXAXAMXSMMSSMMXXAAXAAASMMSSMMMSSMXXMMMMSSMSSMMAXMMSSSSMMSSMSMSSSMAMASMMMSAMAAXSAMMXAAMAMMMSAAMSMSSMXAXMSASAMXSMSMSXSAAA
MXMMXAXXXXXSAMXMMSSXSSSSMAMXMAAAXXSMSMSSSMMSXAXSMXAMAXXMAXAXXAMAAAMMSSMAAAASAXXAAAXAAMXMAAXAXMASMMSAAASMMSMMXMAMMXSAMMAMMSMASASXSAMAXAMASMSM
SAMXSXSMSMASXSXXMAMAAAAAXAMMSMMXSAXXXAAAAXAMMMMMMMMSAMXMSSSSXMMSSMMXAAXMMXMMSSMSMSMSMMXMMSSSMSMMAXAMMMSAMAAMXMXSAXSAMMAMXAAXMXMMMASMMAMXMAMA
MAXAMMMAAMAMXAMXMAXMMMMMSMSXASXAMMSAMXMSMMXSAMAXMXMMMXAAAAAAXXAXAXMMSSMXXAAXXXXMAXAAMAXXMMAXAAMMSSMXSXSXMSSMAMAAXXXAMSSMSAXMMXXASXSXMAMAMMMM
SSMASMXSMSMXSMAXMASMXSMXXAAMMMMMXAXMASMXAAASMXMSMMSAMMSSMMMXAXMSMMXXAXXAMSMMMXSMMMSMMXSAMXXMSMSAAAXSAMMXMAMMAMASMMSAMAXMAXXAXMXMMAXXMAXAXXMA
AASAMMAMXAMXAMAXMAMMAMASMXMSXAAXMASXMMXSMMXXAASAMASASAMAMMXSMAXAXMMSMSMSXXASXAMASAMXSMMMSMMAXAMMSMMXMAMAMAMSXSAXAAXAMXMSAXSSMAASMSMSXSSMSMSS
SAMXAMMXMMXAMXMSMXSMMMAXMMMXMXMXSSMAXMASXMAMSMSAMMSAMXXSMXAAXSSSMSAMXAAMAMAMAMSAMSMAAAAAAAMAMSMAAMAMXSSMSSXSAMASMMXSMXXMAXAAXSASAAASAXAMAAAA
XXXSMXSAMSSSXSSXXAAASMXSXAMAMSSMMASXMMASAMXXAMXAMAMAMXXXAMSSMMAXAMXSSMSMSMSMSXAXSAMXSMMMSXMSMMMMSSMSAMAMAMXMAMMAMXXXASXXMMSSMMAMMMMMXMASMSMM
SAMXSAMASAAMAMMAMSSMMXAMXMMXMAAASMMMMMASMMSSSSSMMXSXMXMMAMAAXMAMXSSMXXAAAXAAXMSXSXSAMASXMASAAXXMXAXMASXMMSSSSMXMAMMMAMXAAMXAMMAMXXMMXSAMMAXX
MAMAMXSMMXMMSMMSMAAAXXSXSMSMMSSMMXMASMAXAXAAXAAXSMMMSMASXMASMMMMMSAMMSMSMSMSMAXASMMMSAMAMXMMXMXASMMSAMXXAMMAMMAMAMMMXMSSMASAMSXMAAMAMXSAMXMX
SAMXSAMXAMXAAXXAMSMMSXMASAAAMMAAMXSSMMXSMMMSMSMMSAAAAAXAMXAMXMAAXMXMMAXAAAXAMMMAMASXMASXMMSAXMMMXAAMAXXMMSMAMMAXASAMXMAAXMMAAXAMSSMAMSXMXAXX
SXSAMMSMSSMSSSSMMXAXAAMMMSMSMSMMSAMASMAAAAXAAMMMSSMSSSMSSXAXAXXSSMSSSMXMSMMXSAMXMXMASAMAAAAMXSAXSMMSSXMASAMASMSSXMASAMSSMXSMMMXMAAXMMSAMXSAX
MMMXSASAMAAAMAAXASXASAMXMXXMAMXAMASAMMSMMMSMSMAMXAMAMAAMXMXSMSMMAMAAXMAMAMASMMMSXMXXMASXMSMXAAMMMMAAMXAXXMSMSAMAXXXAXMAXXAMAAAMMSMMXASAMAMMM
SAMXMASXXSMMMSMMXMMMMAMAASASXXMXSMMMSXMSMMAXAMAMSMMSSMMMAAMXAAAMAMMSMMMSAXMXAAAMAMSASXSXXXXSMMXAXMMSSXSMMMSAMXMASXMMMXMSMSSMMXXAMASMXSAMXSXA
SSSXSMMMMMAMAMSMAMAAAMSMSMAMXMAXXMAMSMAAXSMSSSMXAAAAAXSSMSAMXSSXSXMXXAXMMMXXXMMSAMSAMAMMXMASXXSASXAMXMMAMAMXMMMAMMAXSAMXXAAAAXSASAMXMSXMAMMX
MAXXXAASASXMASAXXSSSXXAMAMSMMMSMSSSMSMSMMXAAMAMSSSMSSMAAAMMXMXAAXSMAXXSASXXSASAMXMMMMAMMAMMMMXXMAXAXAASMMAXSMSMMSSMMSMXMXXXMMXAAMMMMMMAXMSSX
MSMMSSMSASXMXSAMMXMAXMXSAXAAXAAAXAXAMAAMMMMMSAMXXMMAMXXMMSXSMMMMMAMSSMSAMAASAMSAMXSASAMMASAXXXMXMAXSXXMXSMSSXAASXMXAXAAXSSXXSAMXMXSMASMSMAMX
XAAMAMAMXMXXXMAMXAXXSXMSXSSSMXXMMXMMMSMAAAXMMASMAXMASMXSAXXAAASASAMXAMMAMMMMXMMMAASMSAMSAXXSMXAXMAXSMSMXAMAMSMSMAMMXMXXXAAAXXMMMMAASASAAMAMM
SSXMAMXXMSMMMSXMSXMAMAXMMMMAMSSMMXAAAXMSSSXMXAAMSMMMSXAMAXXXMMXXSMMSAMMXMAXXMXASMMSAMAMMSMAMXASMMSSXAXMXMMAMMSXMAMMXSAMMSMMMXSXAMSXMMSXMSMSM
MASXMSMMMAAMAAAMXMASXMMSAMSSMAAAAXSMMSAXAXAXMMSAAAAASMXSAMMSMSXMMMASAMASMMMASXXSAAMXMASAXMSMAMMAXMMMSMMAMMMSMAXSAAMAMASAXASXAMMSMMASAMAXAAAM
SAMXAAAASMSMSSXMAXAXAMXSAXAAMSSMMMAAXMMMAMMSAMXMSSMMSAAMASAAAAXAXMASAMASAAXSXMASXMASMAMMSAAMMMSSMAASAASMSAAAMMMSSSXASAMXSAXMASAMXMASAMMSMSMS
MXSMSMSMSMMAMXMSXMMSMMXSXMSSMXAMXXSXMSAMXMASXSXMXAMXMMMSAMXMAMASAMXSAMSSMMMXAMAMMXXMASXAMMMSXXXASXSSXXXMAMSXSXXMAMMASMMXMAMSMXMAMXMSAMXXXXAX
""";

  public static void main(final String[] args) {
    final List<String> lines = INPUT_MATRIX.lines().toList();
    final int numberOfColumns = lines.getFirst().length();

    int numberOfXmas = 0;

    for (int lineIndex = 0; lineIndex < lines.size() - 2; lineIndex++) {
      for (int colIndex = 0; colIndex < numberOfColumns - 2; colIndex++) {
        final char middleChar = lines.get(lineIndex + 1).charAt(colIndex + 1);
        if (middleChar != 'A') {
          continue;
        }
        final char topLeftChar = lines.get(lineIndex).charAt(colIndex);
        final char bottomLeftChar = lines.get(lineIndex + 2).charAt(colIndex);
        final char topRightChar = lines.get(lineIndex).charAt(colIndex + 2);
        final char bottomRightChar = lines.get(lineIndex + 2).charAt(colIndex + 2);
        if (charAreOpposite(topLeftChar, bottomRightChar)
            && charAreOpposite(bottomLeftChar, topRightChar)) {
          numberOfXmas++;
        }
      }
    }

    System.out.println("Number of X-MAS is " + numberOfXmas);
  }

  private static boolean charAreOpposite(final char firstChar, final char secondChar) {
    return firstChar == 'M' && secondChar == 'S' || firstChar == 'S' && secondChar == 'M';
  }
}